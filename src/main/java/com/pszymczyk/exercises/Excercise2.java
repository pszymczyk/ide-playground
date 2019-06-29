package com.pszymczyk.exercises;

import java.math.BigDecimal;
import java.util.Date;

class Excercise2 {

    /**
     * Korzystając z multiline kursor dodaj słowo kluczowe final do POJO
     *  1) skorzystaj z ręcznego ustawiania kursora Shift+Alt i myszka (Add Caret)
     *  2) skorzystaj z klonowania kursora dół, zacznij od pierwszego pola kliknij dwa razy Alt (Ctrl na Windows/Linux),
     *     przy drugim kliknięciu przytrzymaj alt i następnie strzałka w dół (Clone Caret Below)
     *
     *  help:
     *  https://www.jetbrains.com/help/rider/Multicursor.html#Multicursor.xml
     */

    class SomePOJO {
        private String data;
        private int someOtherData;
        private boolean veryImportantStuff;
        private BigDecimal moreData;
        private Date andMoreData;

        public SomePOJO(String data, int someOtherData, boolean veryImportantStuff, BigDecimal moreData, Date andMoreData) {
            this.data = data;
            this.someOtherData = someOtherData;
            this.veryImportantStuff = veryImportantStuff;
            this.moreData = moreData;
            this.andMoreData = andMoreData;
        }

        public String getData() {
            return data;
        }

        public int getSomeOtherData() {
            return someOtherData;
        }

        public boolean isVeryImportantStuff() {
            return veryImportantStuff;
        }

        public BigDecimal getMoreData() {
            return moreData;
        }

        public Date getAndMoreData() {
            return andMoreData;
        }
    }

}
