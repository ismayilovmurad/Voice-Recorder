package com.muradismayilov.voicerecorder;

public interface OnDatabaseChangedListener {
    void onNewDatabaseEntryAdded();

    void onDatabaseEntryRenamed();
}
