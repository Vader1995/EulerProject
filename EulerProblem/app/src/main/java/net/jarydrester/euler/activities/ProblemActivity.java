package net.jarydrester.euler.activities;

import android.app.Activity;
import android.os.Bundle;

import net.jarydrester.euler.EulerApplication;
import net.jarydrester.euler.R;
import net.jarydrester.euler.intents.ProblemIntent;
import net.jarydrester.euler.models.Problem;
import net.jarydrester.euler.views.ProblemView;

import java.util.List;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ProblemActivity extends Activity {

    @InjectView(R.id.content) ProblemView content;

    @Inject List<Problem> problems;
    private ProblemIntent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);
        ButterKnife.inject(this);
        EulerApplication.inject(this);
        intent = new ProblemIntent(getIntent());
        Problem model = problems.get(intent.getPosition());
        getActionBar().setTitle(model.getSummary());
        content.bind(model);
    }
}