package com.example.karnadevloper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;


public class Main2Activity extends AppCompatActivity  {

private DrawerLayout drawerLayout;
private ActionBarDrawerToggle mtoggle;
private NavigationView n_view;
 ListView listView;
    String []list={"Computer Engineering","Information technology","Electronic and Communication","Electrical Engineering","Mechanical Engineering" ,"Civil Engineering"};
    Integer[] images={R.drawable.ce1,R.drawable.it,R.drawable.ec,R.drawable.ee,R.drawable.me,R.drawable.cl};
    CustomAdaptar adaptar;

    private static RecyclerView recyclerView1;



  //  String []list={"Computer Engineering","Informational technology","Electronic and Communication","Electrical Engineering","Mechanical Engineering" ,"Civil Engineering"};
   // Integer[] images={R.drawable.ce,R.drawable.ce,R.drawable.ce,R.drawable.ce,R.drawable.ce,R.drawable.ce};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView1=findViewById(R.id.listview);

        recyclerView1.setHasFixedSize(true);


        recyclerView1.setLayoutManager(new LinearLayoutManager(this));


        adaptar=new CustomAdaptar(this,list,images);
        recyclerView1.setAdapter(adaptar);





        drawerLayout=findViewById(R.id.drawer) ;
n_view=(NavigationView) findViewById(R.id.navigation);
n_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
      //  if (menuItem.isChecked()) menuItem.setChecked(false);
        //else menuItem.setChecked(true);
       drawerLayout.closeDrawers();
        menuItem.setChecked(true);

        int item=menuItem.getItemId();
        switch ( item){
            case R.id.logout:
                FirebaseAuth.getInstance().signOut();
                finish();
                startActivity(new Intent(Main2Activity.this,Login.class));
                //drawerLayout.closeDrawers();
                break;

            case R.id.home:
                startActivity(new Intent(Main2Activity.this,Main2Activity.class));
               // drawerLayout.closeDrawers();
                break;

            case R.id.developer:
                //setContentView(R.layout.developer_detail);
                startActivity(new Intent(Main2Activity.this,Developer_details.class));
               // drawerLayout.closeDrawers();
                break;

            case R.id.study_m:
                Toast.makeText(Main2Activity.this, "Coming soon..", Toast.LENGTH_SHORT).show();
               // drawerLayout.closeDrawers();
                break;

        }
        return false;
    }
});
mtoggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.Close);

drawerLayout.addDrawerListener(mtoggle);
mtoggle.syncState();
getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // listView= findViewById(R.id.listview);
        // ArrayList<String> list=new ArrayList<String>();




        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
//        listView.setAdapter( adaptar);
//listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//    @Override
//            public void onItemClick(AdapterView<?> parent, View view ,int position,long id)
//    {
//        String itemValue=adaptar.getItem(position).toString();
//       // Toast.makeText(Main2Activity.this,itemValue, Toast.LENGTH_SHORT).show();
//
//        Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
//       intent.putExtra("itemValue",itemValue);
//        startActivity(intent);
//        finish();
//
//    }
//        });
//        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
//            int mLastFirstVisibleItem = 0;
//
//            @Override
//            public void onScrollStateChanged(AbsListView absListView, int i) {
//            }
//
//            @Override
//            public void onScroll(AbsListView absListView, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
//                if (absListView.getId() == listView.getId()) {
//                    final int currentFistVisibleItem = listView.getFirstVisiblePosition();
//                    if (currentFistVisibleItem > mLastFirstVisibleItem) {
//                        getSupportActionBar().hide();
//                    } else if (currentFistVisibleItem < mLastFirstVisibleItem) {
//                        getSupportActionBar().show();
//                    }
//                    mLastFirstVisibleItem = currentFistVisibleItem;
//                }
//            }
//        });



    }

    @Override
    public  void onBackPressed()
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("Do you want to Exit?")
                .setCancelable(false)
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        finishAffinity();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem  item)
    {
        if(mtoggle.onOptionsItemSelected(item))
        {
            return true;

        }
   return super.onOptionsItemSelected(item);
    }
}

class CustomAdaptar extends RecyclerView.Adapter<CustomAdaptar.MyViewHolder> {

    Context context;
    Integer [] images;

    static String[] list;
    LayoutInflater inflater;

   LinearLayout parentl;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;

        ImageView imageViewIcon;
        LinearLayout parentl;

        public MyViewHolder(View itemView) {
            super(itemView);
            textViewName = (TextView) itemView.findViewById(R.id.text);

            imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
            parentl=(LinearLayout) itemView.findViewById(R.id.parent);


        }



    }


    public  CustomAdaptar(Context context,String[]list,Integer[] images ) {
        this.context=context;
        this.list=list;
        this.images=images;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view= inflater.inflate(R.layout.custom_layout,parent,false);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {


        holder.textViewName.setText(list[listPosition]);


        holder.imageViewIcon.setImageResource(images[listPosition]);


        holder.parentl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(context, list[listPosition], Toast.LENGTH_SHORT).show();
                String itemValue=list[listPosition];
                Intent intent=new Intent(context,Main3Activity.class);
       intent.putExtra("itemValue",itemValue);
        context.startActivity(intent);


            }
        });

    }



    @Override
    public int getItemCount() {
        return images.length;
    }}
