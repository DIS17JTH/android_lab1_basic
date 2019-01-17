package se.ju.students.malu1798.lab_1_todo_app_1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class DeleteTodoActivity extends AppCompatActivity {
    int i = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_todo);
        Intent intent = getIntent();
        String s = intent.getStringExtra("test");
        i = intent.getIntExtra("todoIndex", 0);
        System.out.println("------------------------ " + s);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(Data.todos.get(i).title);
    }

    public void deleteThisButtonClicked(View view){
        System.out.print("Button Delete clicked");
        new AlertDialog.Builder(this)
                .setTitle("Delete ToDo")
                .setMessage("Do you really want to delete it?")
                .setPositiveButton(
                        android.R.string.yes,
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int whichButton){

                                // Delete it.
                                Data.deleteTodo(i);
                                finish();
                            }
                        }
                ).setNegativeButton(
                android.R.string.no,
                new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int whichButton){
                        // Do not delete it.
                        dialog.dismiss();
                    }
                }
        ).show();
    }
}
