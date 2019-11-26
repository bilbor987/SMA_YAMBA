package com.marakana.yamba;

import android.app.ListFragment;
import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.View;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.SimpleCursorAdapter.ViewBinder;
import android.widget.TextView;
import android.widget.Toast;

public class TimelineFragment extends ListFragment {
    private static final String TAG = TimelineFragment.class.getSimpleName();
    private static final String[] FROM = {StatusContract.Column.USER,
            StatusContract.Column.MESSAGE, StatusContract.Column.CREATED_AT,
            StatusContract.Column.CREATED_AT};
    private static final int[] TO = {R.id.list_item_text_user,
            R.id.list_item_text_message, R.id.list_item_text_created_at,
            R.id.list_item_freshness};

    private SimpleCursorAdapter mAdapter;


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setEmptyText("Loading data...");
        mAdapter = new SimpleCursorAdapter(getActivity(), R.layout.list_item, null,
                FROM, TO, 0);

        setListAdapter(mAdapter);

    }


}