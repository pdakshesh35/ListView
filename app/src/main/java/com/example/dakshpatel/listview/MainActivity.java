package com.example.dakshpatel.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {


    public MainActivity() {


    }

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.list);

        HashMap<String, String> nameAddresses = new HashMap<>();
        nameAddresses.put("Daksh", "Bestfsad fsadf asdf asd fasd fasdfasd fasdf asf as ffsasd fasf asf");
        nameAddresses.put("Ritul", "Better");
        nameAddresses.put("Heli", "Love");
        nameAddresses.put("Dishant", "Comady Kalakar");

        List<HashMap<String, String>> listItems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this,listItems, R.layout.list_item,
                new String[]{"First Line", "Second Line"},
                new int[]{R.id.text1, R.id.text2}
                );
        Iterator i = nameAddresses.entrySet().iterator();

        while(i.hasNext()){
            HashMap<String, String> result = new HashMap<>();
            Map.Entry pair = (Map.Entry)i.next();
            result.put("First Line", pair.getKey().toString());
            result.put("Second Line", pair.getValue().toString());
            listItems.add(result);
        }
        list.setAdapter(adapter);


    }
}
