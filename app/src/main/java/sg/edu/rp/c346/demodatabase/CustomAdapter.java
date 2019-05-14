package sg.edu.rp.c346.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.security.spec.RSAPublicKeySpec;
import java.util.ArrayList;

import sg.edu.rp.c346.demodatabase.R;
import sg.edu.rp.c346.demodatabase.Task;

public class CustomAdapter extends ArrayAdapter<Task> {
    private ArrayList<Task> task;
    private Context context;
    private TextView tvID;
    private TextView tvDescription;
    private TextView tvDate;

    public CustomAdapter(Context context, int resource, ArrayList<Task> objects) {
        super(context, resource, objects);

        task = objects;

        this.context = context;
    }

    public View getView(int pos, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvID = rowView.findViewById(R.id.tvID);
        tvDescription = rowView.findViewById(R.id.tvDesc);
        tvDate = rowView.findViewById(R.id.tvDate);

        Task currentTask = task.get(pos);
        tvID.setText(String.valueOf(currentTask.getId()));
        tvDescription.setText(currentTask.getDescription());
        tvDate.setText(currentTask.getDate());
        return rowView;
    }
}

