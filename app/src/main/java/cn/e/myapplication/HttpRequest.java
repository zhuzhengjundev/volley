package cn.e.myapplication;

import com.android.volley.Response;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONObject;

public class HttpRequest {

    public static void postJSONArray(String links, JSONObject jsonObject, Response.Listener<JSONArray> listener, Response.ErrorListener errorListener) {
        JsonArrayRequest request = new JsonArrayRequest(1, links, jsonObject, listener, errorListener);
        MyApplication.queue.add(request);
    }

    public static void postJSONObject(String links, JSONObject jsonObject, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        JsonObjectRequest request = new JsonObjectRequest(1, links, jsonObject, listener, errorListener);
        MyApplication.queue.add(request);
    }

    public static void getString(String str, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        StringRequest request = new StringRequest(str, listener, errorListener);
        MyApplication.queue.add(request);
    }
}
