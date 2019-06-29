package com.pszymczyk.exercises;

import java.math.BigDecimal;
import java.util.Date;

class Excercise3 {

    /**
     * Korzystając z multiline kursor usuń wystąpienia adnotacji @Deprecated
     *  1) zaznacz automatycznie wszystkie wystapienia @Deprecated, zaznacz dowolne wystąpienie słowa,
     *     następnie kliknij Cmd+Ctrl+G (Shift+Ctrl+Alt+J Windows/Linux)
     *  2) skorzystaj z ręcznego wyszukiwania i klonowania kursora, zaznacz szukane słowo @Deprecated,
     *     zaznaczaj kolejne wystąpienia klikając Ctrl+G (Alt+J Windows/Linux)
     *  3) Część z pól w POJO ma przedrostek _, usuń go korzystając z poznanych wcześniej skrótów
     *
     *  help:
     *  https://www.jetbrains.com/help/rider/Selecting_Text_in_the_Editor.html
     */

    class SomeDeprecatedPOJO {
        private String _data;
        private int _someOtherData;
        private boolean veryImportantStuff;
        private BigDecimal _moreData;
        private Date andMoreData;

        public SomeDeprecatedPOJO(String data, int someOtherData, boolean veryImportantStuff, BigDecimal moreData, Date andMoreData) {
            this._data = data;
            this._someOtherData = someOtherData;
            this.veryImportantStuff = veryImportantStuff;
            this._moreData = moreData;
            this.andMoreData = andMoreData;
        }

        @Deprecated
        public String getData() {
            return _data;
        }

        @Deprecated
        public int getSomeOtherData() {
            return _someOtherData;
        }

        @Deprecated
        public boolean isVeryImportantStuff() {
            return veryImportantStuff;
        }

        @Deprecated
        public BigDecimal getMoreData() {
            return _moreData;
        }

        public Date getAndMoreData() {
            return andMoreData;
        }
    }

}
