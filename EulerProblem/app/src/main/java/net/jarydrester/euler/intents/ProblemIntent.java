package net.jarydrester.euler.intents;

import android.content.Context;
import android.content.Intent;

import net.jarydrester.euler.activities.ProblemActivity;

public class ProblemIntent {

    private static final String EXTRA_POSITION = "position";

    private final Intent intent;

    public ProblemIntent(Intent intent) {
        this.intent = intent;
    }

    public int getPosition() {
        return intent.getIntExtra(EXTRA_POSITION, -1);
    }

    public static class Builder {

        private final Intent intent;

        public Builder(Context context) {
            intent = new Intent(context, ProblemActivity.class);
        }

        public Builder position(int position) {
            intent.putExtra(EXTRA_POSITION, position);
            return this;
        }

        public Intent build() {
            return intent;
        }
    }
}