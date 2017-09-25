package id.decoded.moeslim.intentexplicit;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by moeslim on 25/09/17.
 */

class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity contex;
    private final String[] menuItem;
    private final Integer[] menuGambar;

    public CustomListAdapter(Activity contex1, String[] menuItem, Integer[] menuGambar){
        super(contex1, R.layout.list_item, menuItem);


        this.contex = contex1;
        this.menuItem = menuItem;
        this.menuGambar = menuGambar;
    }

    public View getView (int posisi, View view, ViewGroup parent){
        LayoutInflater inflater = contex.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item, null, true);

        TextView txtMenu = (TextView)rowView.findViewById(R.id.textTittle);
        ImageView imgData = (ImageView)rowView.findViewById(R.id.imageView);

        txtMenu.setText(menuItem[posisi]);
        imgData.setImageResource(menuGambar[posisi]);

        return  rowView;
    }
}
