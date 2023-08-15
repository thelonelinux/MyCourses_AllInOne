package com.codingblocks.listviewcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Student> studentArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student s = new Student("Name","Age","Number","location");

        Student s2 = new Student();
        s2.setName("Harshit");
        s2.setLocation("Location");

        studentArrayList.add(new Student("Harshit", "Android", "123", "Delhi"));
        studentArrayList.add(new Student("Naman", "Android", "456", "New Delhi"));
        studentArrayList.add(new Student("Ashutosh", "Web", "789", "Dwarka"));
        studentArrayList.add(new Student("Shlok", "Web", "101112", "Pitampura"));
        studentArrayList.add(new Student("Omisha", "C++", "131415", "Dwarka"));
        studentArrayList.add(new Student("Harshit", "Android", "123", "Delhi"));
        studentArrayList.add(new Student("Naman", "Android", "456", "New Delhi"));
        studentArrayList.add(new Student("Ashutosh", "Web", "789", "Dwarka"));
        studentArrayList.add(new Student("Shlok", "Web", "101112", "Pitampura"));
        studentArrayList.add(new Student("Omisha", "C++", "131415", "Dwarka"));
        studentArrayList.add(new Student("Harshit", "Android", "123", "Delhi"));
        studentArrayList.add(new Student("Naman", "Android", "456", "New Delhi"));
        studentArrayList.add(new Student("Ashutosh", "Web", "789", "Dwarka"));
        studentArrayList.add(new Student("Shlok", "Web", "101112", "Pitampura"));
        studentArrayList.add(new Student("Omisha", "C++", "131415", "Dwarka"));
        studentArrayList.add(new Student("Harshit", "Android", "123", "Delhi"));
        studentArrayList.add(new Student("Naman", "Android", "456", "New Delhi"));
        studentArrayList.add(new Student("Ashutosh", "Web", "789", "Dwarka"));
        studentArrayList.add(new Student("Shlok", "Web", "101112", "Pitampura"));
        studentArrayList.add(new Student("Harshit", "Android", "123", "Delhi"));
        studentArrayList.add(new Student("Naman", "Android", "456", "New Delhi"));
        studentArrayList.add(new Student("Ashutosh", "Web", "789", "Dwarka"));
        studentArrayList.add(new Student("Shlok", "Web", "101112", "Pitampura"));
        studentArrayList.add(new Student("Omisha", "C++", "131415", "Dwarka"));
        studentArrayList.add(new Student("Harshit", "Android", "123", "Delhi"));
        studentArrayList.add(new Student("Naman", "Android", "456", "New Delhi"));
        studentArrayList.add(new Student("Ashutosh", "Web", "789", "Dwarka"));
        studentArrayList.add(new Student("Shlok", "Web", "101112", "Pitampura"));
        studentArrayList.add(new Student("Harshit", "Android", "123", "Delhi"));
        studentArrayList.add(new Student("Naman", "Android", "456", "New Delhi"));
        studentArrayList.add(new Student("Ashutosh", "Web", "789", "Dwarka"));
        studentArrayList.add(new Student("Shlok", "Web", "101112", "Pitampura"));
        studentArrayList.add(new Student("Omisha", "C++", "131415", "Dwarka"));
        studentArrayList.add(new Student("Harshit", "Android", "123", "Delhi"));
        studentArrayList.add(new Student("Naman", "Android", "456", "New Delhi"));
        studentArrayList.add(new Student("Ashutosh", "Web", "789", "Dwarka"));
        studentArrayList.add(new Student("Shlok", "Web", "101112", "Pitampura"));
        studentArrayList.add(new Student("Harshit", "Android", "123", "Delhi"));
        studentArrayList.add(new Student("Naman", "Android", "456", "New Delhi"));
        studentArrayList.add(new Student("Ashutosh", "Web", "789", "Dwarka"));
        studentArrayList.add(new Student("Shlok", "Web", "101112", "Pitampura"));
        studentArrayList.add(new Student("Omisha", "C++", "131415", "Dwarka"));
        studentArrayList.add(new Student("Harshit", "Android", "123", "Delhi"));
        studentArrayList.add(new Student("Naman", "Android", "456", "New Delhi"));
        studentArrayList.add(new Student("Ashutosh", "Web", "789", "Dwarka"));
        studentArrayList.add(new Student("Shlok", "Web", "101112", "Pitampura"));
        studentArrayList.add(new Student("Harshit", "Android", "123", "Delhi"));
        studentArrayList.add(new Student("Naman", "Android", "456", "New Delhi"));
        studentArrayList.add(new Student("Ashutosh", "Web", "789", "Dwarka"));
        studentArrayList.add(new Student("Shlok", "Web", "101112", "Pitampura"));
        studentArrayList.add(new Student("Omisha", "C++", "131415", "Dwarka"));
        studentArrayList.add(new Student("Harshit", "Android", "123", "Delhi"));
        studentArrayList.add(new Student("Naman", "Android", "456", "New Delhi"));
        studentArrayList.add(new Student("Ashutosh", "Web", "789", "Dwarka"));
        studentArrayList.add(new Student("Shlok", "Web", "101112", "Pitampura"));
        ListView studentList = findViewById(R.id.listView);

        studentList.setAdapter(new MyCustomAdapter());
    }


    class MyCustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return studentArrayList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater li = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
            Log.e("TAG", "getView: " + view);
            View rowView;
            if (view == null){
                rowView = li.inflate(R.layout.item_row,viewGroup,false);
                ViewHolder viewHolder = new ViewHolder(rowView);
                rowView.setTag(viewHolder);
            }else {
                rowView = view;
            }
            Student currentStudent = studentArrayList.get(i);

            ViewHolder vh = (ViewHolder) rowView.getTag();
            vh.name.setText(currentStudent.getName());
            vh.btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });


            /*
             * //            TextView studentName = rowView.findViewById(R.id.studentName);
             //            TextView studentBatch = rowView.findViewById(R.id.studentBatch);
             //            TextView studentNumber = rowView.findViewById(R.id.studentNumber);
             //            TextView studentLocation = rowView.findViewById(R.id.studentLocation);
             //            Button btn = rowView.findViewById(R.id.idBtn);


             //            btn.setOnClickListener(new View.OnClickListener() {
             //                @Override
             //                public void onClick(View view) {
             //                    //Do something
             //                }
             //            });
             //
             //            studentName.setText(currentStudent.getName());
             //            studentBatch.setText(currentStudent.getBatch());
             //            studentNumber.setText(currentStudent.getNumber());
             //            studentLocation.setText(currentStudent.getLocation());
             */

            return rowView;
        }
    }

    class ViewHolder{
        TextView name,batch,number,location;
        Button btn;

        public ViewHolder(View inflatedView) {
            batch = inflatedView.findViewById(R.id.studentBatch);
            number = inflatedView.findViewById(R.id.studentNumber);
            name = inflatedView.findViewById(R.id.studentName);
            location = inflatedView.findViewById(R.id.studentLocation);
        }

        public TextView getName() {
            return name;
        }

        public void setName(TextView name) {
            this.name = name;
        }

        public TextView getBatch() {
            return batch;
        }

        public void setBatch(TextView batch) {
            this.batch = batch;
        }

        public TextView getNumber() {
            return number;
        }

        public void setNumber(TextView number) {
            this.number = number;
        }

        public TextView getLocation() {
            return location;
        }

        public void setLocation(TextView location) {
            this.location = location;
        }

        public Button getBtn() {
            return btn;
        }

        public void setBtn(Button btn) {
            this.btn = btn;
        }
    }

}
