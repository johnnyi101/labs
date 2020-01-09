import exercise.DataSet;

public class MergeJoin {

        // Both left and right must be sorted
        public static DataSet merge(DataSet left, DataSet right) {
            DataSet output = new DataSet();
            while (!left.isPastEnd() || !right.isPastEnd()) {
                if (left.getKey() == right.getKey()) {
                    output.add(left.getKey());
                    left.advance();
                    right.advance();
                } else if (left.getKey() < right.getKey())
                    left.advance();
                else
                    right.advance();
            }
            return output;
        }
    }

