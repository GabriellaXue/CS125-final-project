package edu.illinois.cs.cs125.spring2019.lab12;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import java.util.ArrayList;


import com.android.volley.RequestQueue;


/**
 * Main class.
 */
public final class MainActivity extends AppCompatActivity {
    /** Default logging tag for messages from the main activity. */
    private static final String TAG = "   SUDOKU";

    /** Request queue for our API requests. */
    private static RequestQueue requestQueue;
    /**
     * 9.
     */
    private final int num = 9;
    /**
     * store input.
     */
    private ArrayList<Integer> value;
    /**
     * Error Message.
     */
    private String error = "Bad Input";
    /**
     * Run when this activity comes to the foreground.
     *
     * @param savedInstanceState unused
     */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText one = findViewById(R.id.one);
        TextView two = findViewById(R.id.two);
        TextView three = findViewById(R.id.three);
        TextView four = findViewById(R.id.four);
        TextView five = findViewById(R.id.five);
        TextView six = findViewById(R.id.six);
        TextView seven = findViewById(R.id.seven);
        TextView eight = findViewById(R.id.eight);
        TextView nine = findViewById(R.id.nine);
        one.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(final View v, final boolean hasFocus) {
                one.setText("");
                if (hasFocus) {
                    String s = one.getText().toString();
                    System.out.println(s.length() + " outside");
                    if (s.length() == 1) {
                        System.out.println("length == 1");
                        one.setFocusable(false);
                        try {
                            int valueOne = Integer.parseInt(s);
                            value.add(valueOne);
                        } catch (Exception e) {
                            one.setText("OHHHHHHH");
                        }
                        one.setText(s);
                    } else if (s.length() > 1) {
                        one.setText("");
                        System.out.println(s.length());
                    }
                }
                //one.setFocusable(true);
                //one.setFocusable(false);
            }
        });
    }


}
