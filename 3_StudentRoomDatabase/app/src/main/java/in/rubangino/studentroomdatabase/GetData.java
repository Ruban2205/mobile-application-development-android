package in.rubangino.studentroomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import in.rubangino.studentroomdatabase.Adapter.UserAdapter;
import in.rubangino.studentroomdatabase.EntityClass.UserModel;

public class GetData extends AppCompatActivity {


    RecyclerView recyclerview;

    private List<UserModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);
        recyclerview = findViewById(R.id.recyclerview);

    }

    @Override
    protected void onResume() {
        super.onResume();
        getData();

    }

    private void getData() {
        list = new ArrayList<>();
        list = DatabaseClass.getDatabase(getApplicationContext()).getDao().getAllData();
        recyclerview.setAdapter(new UserAdapter(getApplicationContext(), list, new UserAdapter.DeleteItemClicklistner() {
            @Override
            public void onItemDelete(int position, int id) {
                DatabaseClass.getDatabase(getApplicationContext()).getDao().deleteData(id);
                getData();
            }
        }));
    }
}