package fujitsu.mobile_application;

/**
 * Created by h.delrosario on 10/10/2017.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Context;
import java.util.List;

public class RecyclerViewCardViewAdapter extends RecyclerView.Adapter<RecyclerViewCardViewAdapter.ViewHolder> {

    Context context;

    List<subjects> subjects;

    public RecyclerViewCardViewAdapter(List<subjects> getDataAdapter, Context context){

        super();

        this.subjects = getDataAdapter;

        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        subjects getDataAdapter1 =  subjects.get(position);

        holder.SubjectName.setText(getDataAdapter1.getName());

    }

    @Override
    public int getItemCount() {

        return subjects.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public TextView SubjectName;


        public ViewHolder(View itemView) {

            super(itemView);

            SubjectName = (TextView) itemView.findViewById(R.id.TextViewCard) ;


        }
    }
}