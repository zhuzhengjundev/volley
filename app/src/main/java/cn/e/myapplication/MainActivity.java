package cn.e.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            HttpRequest.postJSONArray("url", new JSONObject("{}"), new Response.Listener<JSONArray>() {
                @Override
                public void onResponse(JSONArray jsonArray) {
                    //访问成功操作，得到了JSONArray类型的数据
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    //访问错误的操作
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }


        try {
            HttpRequest.postJSONObject("url", new JSONObject("{}"), new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject jsonObject) {
                    //访问成功操作，得到了JSONObject类型的数据
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    //访问错误的操作
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }

        HttpRequest.getString("url", new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                //访问成功操作，得到了String类型的数据
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                //访问错误的操作
            }
        });
    }
}
