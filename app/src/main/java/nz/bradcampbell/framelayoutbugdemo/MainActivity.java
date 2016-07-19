package nz.bradcampbell.framelayoutbugdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new MyAdapter());
    }

    public static final class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

        @Override public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false));
        }

        @Override public void onBindViewHolder(MyViewHolder holder, int position) {
            // Nothing to do
        }

        @Override public int getItemCount() {
            return 1;
        }
    }

    public static final class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
