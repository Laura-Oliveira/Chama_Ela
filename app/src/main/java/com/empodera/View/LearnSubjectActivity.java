package com.empodera.View;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.empodera.R;

public class LearnSubjectActivity extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_subject);

        view = findViewById(R.id.screen_learn_subject);
        view.setBackgroundColor(getResources().getColor(R.color.color_background));
        TextView txtLinkMarmitex = findViewById(R.id.link_marmitex);
        txtLinkMarmitex.setMovementMethod(LinkMovementMethod.getInstance());

        TextView txtLinkSummer = findViewById(R.id.link_summer);
        txtLinkSummer.setMovementMethod(LinkMovementMethod.getInstance());

        TextView txtLinkRevendaProdutos = findViewById(R.id.link_revenda_produtos);
        txtLinkRevendaProdutos.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
