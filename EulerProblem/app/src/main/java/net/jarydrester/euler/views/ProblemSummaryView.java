package net.jarydrester.euler.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.phrase.Phrase;

import net.jarydrester.euler.R;
import net.jarydrester.euler.models.Problem;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ProblemSummaryView extends LinearLayout {

    @InjectView(R.id.problem_number) TextView problemNumber;
    @InjectView(R.id.summary) TextView summary;

    private Problem model;

    public ProblemSummaryView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void bind(Problem problem) {
        this.model = problem;
        CharSequence problemNumberPhrase = Phrase.from(getContext(), R.string.problem_number)
                .put("number", model.getProblemNumber())
                .format();
        problemNumber.setText(problemNumberPhrase);
        summary.setText(model.getSummary());
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.inject(this);
    }
}