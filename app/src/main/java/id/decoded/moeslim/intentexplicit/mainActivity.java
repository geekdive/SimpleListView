package id.decoded.moeslim.intentexplicit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class mainActivity extends AppCompatActivity {

    String[] menuItem = {
            "Safari",
            "Chrome",
            "Firefox",
            "Site Browser",
            "Opera",
    };

    Integer[] menuImage = {
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher
    };

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter = new CustomListAdapter(this, menuItem, menuImage);

        list = (ListView)findViewById(R.id.mobile_list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posisi, long l) {
                String pilihanYangDikirim = menuItem[posisi];

                Intent intent = new Intent(mainActivity.this, secondActivity.class);
                intent.putExtra("PILIHAN", pilihanYangDikirim);
                startActivity(intent);
            }
        });

    }
}
