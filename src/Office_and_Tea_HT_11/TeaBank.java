package Office_and_Tea_HT_11;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TeaBank {
        private List<TeaType> teaBank;

        public TeaBank() {
            this.teaBank = fillTeaBank();
        }

        private List<TeaType> fillTeaBank() {
            List<TeaType> teaBank = new ArrayList<>();
            Random random = new Random();

            int teaCount = random.nextInt(11) + 10;
            for (int i = 0; i < teaCount; i++) {
                teaBank.add(TeaType.values()[random.nextInt(TeaType.values().length)]);
            }
            System.out.println("The tea bank was filled with: " + teaBank);
            return teaBank;
        }

        public boolean hasTea() {
            return !teaBank.isEmpty();
        }

        public TeaType getTea() {
            Random random = new Random();
            return teaBank.remove(random.nextInt(teaBank.size()));
        }

        public int teaRemaining() {
            return teaBank.size();
        }
}
