public class University {
    class University {
        private Lab[] labs;
        public University() {
        }
        public University(Lab[] labs) {
            this.labs = labs;
        }
        public Lab[] getLabs() {
            return labs;
        }

        public void setLabs(Lab[] labs) {
            this.labs = labs;
        }
        public void addLab(Lab lab) {
            // Implement logic to add a lab
        }
        public void removeLab(Lab lab) {
            // Implement logic to remove a lab
        }
        public Lab fetchLab(String labID) {
            // Implement logic to fetch a lab
            return null;
        }
        public void fetchLabDetails(String labID) {
        }

        public void fetchComputerDetails(String computerNumber) {
        }
    }
}
