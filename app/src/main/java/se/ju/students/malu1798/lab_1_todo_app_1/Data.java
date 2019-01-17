package se.ju.students.malu1798.lab_1_todo_app_1;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class Data extends AppCompatActivity {
    public static ArrayList<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo("Do A"));
        todos.add(new Todo("Do B"));
        todos.add(new Todo("Do C"));
    }
    public static class Todo{
        public String title;
        public Todo(String title) {this.title = title;}
        @Override
        public String toString() {return "Todo: "+ title;}
    }
}
