package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvEmployee;
    ArrayList<EmployeeInfo> alEmployeeInfo;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.listViewEmployee);

        alEmployeeInfo = new ArrayList<>();
        EmployeeInfo info1 = new EmployeeInfo("John", "Software Technical Leader",3400.0);
        EmployeeInfo info2 = new EmployeeInfo("May", "Programmer",2200.0);
        EmployeeInfo info3 = new EmployeeInfo("Amal", "Programmer",2200.0);
        EmployeeInfo info4 = new EmployeeInfo("Clement", "Programmer",2200.0);
        EmployeeInfo info5 = new EmployeeInfo("Syafiqah", "Programmer",2200.0);
        EmployeeInfo info6 = new EmployeeInfo("Amos", "Programmer",2200.0);
        alEmployeeInfo.add(info1);
        alEmployeeInfo.add(info2);
        alEmployeeInfo.add(info3);
        alEmployeeInfo.add(info4);
        alEmployeeInfo.add(info5);
        alEmployeeInfo.add(info6);

        caEmployee = new CustomAdapter(this,R.layout.exercise2b,alEmployeeInfo);

        lvEmployee.setAdapter(caEmployee);
    }
}
