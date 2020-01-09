package exercise;import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


    public class DataSet {
        public static final int ENDPOS = -1;
        private List<Integer> list;
        private int position = 0;

        public DataSet() {
            this(new ArrayList<Integer>());
        }

        public DataSet(List<Integer> list) {
            this.list = list;
        }

        public int getPosition() {
            return position;
        }

        public Integer getKey() {
            return list.get(position);
        }

        public boolean advance() {
            if (position == list.size() - 1 || position == ENDPOS) {
                position = ENDPOS;
                return false;
            }
            position++;
            return true;
        }

        public void add(int key) {
            list.add(key);
        }

        public boolean isPastEnd() {
            return position == ENDPOS;
        }
    }



