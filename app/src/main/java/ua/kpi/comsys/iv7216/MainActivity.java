package ua.kpi.comsys.iv7216;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import java.sql.Time;

public class MainActivity extends AppCompatActivity {
    private TextView resultElement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultElement = findViewById(R.id.id1);
        try {
            //task 8
            TimeVM t1 = new TimeVM();
            TimeVM t2 = new TimeVM(15, 31, 14);;
            TimeVM t3 = new TimeVM(new Time(11, 10,31));

            //task 9
            resultElement.setText("toString  "+ t2.toString()
                    + "\nsum  " + t1.sum(t2).toString()
                    + "\ndiff  "+ t1.diff(t3).toString()
                    + "\nstatic sum  "+ TimeVM.sum(t2, t3).toString()
                    + "\nstatic diff  "+ TimeVM.diff(t2, t3).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}