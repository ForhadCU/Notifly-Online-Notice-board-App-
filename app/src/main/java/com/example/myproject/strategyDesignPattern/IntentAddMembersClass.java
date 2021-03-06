package com.example.myproject.strategyDesignPattern;

import android.content.Context;
import android.content.Intent;

import com.example.myproject.AddMembersActivity;
import com.example.myproject.NoticesActivity;

public class IntentAddMembersClass implements IStrategy{
    Context context;

    public IntentAddMembersClass(Context context) {
        this.context = context;
    }

    @Override
    public void mIntentData(String gId, String gName) {
        Intent intent = new Intent(context, AddMembersActivity.class);
        intent.putExtra("gId", gId);
        intent.putExtra("gName", gName);

        context.startActivity(intent);
    }
}
