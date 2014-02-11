package net.jarydrester.euler.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class BindableAdapter<T> extends BaseAdapter {

    private final Context context;
    private final LayoutInflater inflater;

    public BindableAdapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    public abstract T getItem(int position);
    public abstract View createView(LayoutInflater inflater, int position, ViewGroup parent);
    public abstract void bindView(T item, int position, View view);

    protected Context getContext() {
        return context;
    }

    @Override
    public final View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = createView(inflater, position, parent);
        }
        bindView(getItem(position), position, convertView);
        return convertView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = createDropdownView(inflater, position, parent);
        }
        bindDropdownView(getItem(position), position, convertView);
        return convertView;
    }

    public View createDropdownView(LayoutInflater inflater, int position, ViewGroup parent) {
        return createView(inflater, position, parent);
    }

    public void bindDropdownView(T item, int position, View view) {
        bindView(item, position, view);
    }
}