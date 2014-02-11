package net.jarydrester.euler.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import net.jarydrester.euler.R;
import net.jarydrester.euler.models.Problem;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class ProblemView extends LinearLayout {

    @InjectView(R.id.description) TextView description;
    @InjectView(R.id.input) EditText input;
    @InjectView(R.id.output) TextView output;

    private Problem model;

    public ProblemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void bind(Problem problem) {
        this.model = problem;
        description.setText(model.getDescription());
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.inject(this);
    }

    @OnClick(R.id.solve)
    public void solve() {
        String solution = model.solve(input.getText().toString());
        output.setText(solution);
    }
}