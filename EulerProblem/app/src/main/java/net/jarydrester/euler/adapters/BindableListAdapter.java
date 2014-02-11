package net.jarydrester.euler.adapters;

import android.content.Context;

import java.util.List;

public abstract class BindableListAdapter<T> extends BindableAdapter<T> {

    private List<T> items;

    public BindableListAdapter(Context context, List<T> items) {
        super(context);
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public T getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}