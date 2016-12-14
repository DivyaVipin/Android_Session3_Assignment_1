package assignment.android.test.googleintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSearch;
    TextView txtSearch;
    EditText editSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSearch=(Button)findViewById(R.id.btnSearch);
        txtSearch=(TextView)findViewById(R.id.textViewContent);
        editSearch=(EditText)findViewById(R.id.editTextContent);



        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String searchText=editSearch.getText().toString();
                String url="https://google.com/search?q="+searchText;
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}
