package il.ac.huji.tipcalculator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class TipCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
    }

    public void calculate(View view) {
        EditText bill = (EditText) findViewById(R.id.edit_bill);
        CheckBox checkRound = (CheckBox) findViewById(R.id.chkRound);
        TextView total = (TextView) findViewById(R.id.txtTipResult);
        double billAmount = 0;
        final double tipPercent = 12;
        billAmount = Double.parseDouble(bill.getText().toString());
        double result = (billAmount * (tipPercent/100));
        if (checkRound.isChecked()) {
            result = Math.round(result);
            total.setText("$" + Integer.toString((int)result));
            return;
        }
        total.setText("$" + Double.toString(result));
    }
}