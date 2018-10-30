package com.example.tynerl2058.criminalintent;

import android.support.v7.app.AppCompatActivity;

import java.util.Date;
import java.util.UUID;

public class Crime {

        private UUID mId;
        private String mTitle;
        private Date mDate;
        private boolean mSolved;

        public Crime () {
            mId = UUID.randomUUID();
            mDate = new Date();
        }

        public  UUID getId() {
            return mId;
        }

        public String getTitle() {
            return mTitle;
        }

        public void setTtitle(String title) {
            mTitle = title;
        }

        public Date getDate() {
            return mDate;
        }

        public void setDate(Date date) {
            mDate = date;
        }

        public boolean isSolved() {
            return mSolved;
        }

        public void setSolved(boolean solved) {
            mSolved = solved;
        }
    }

