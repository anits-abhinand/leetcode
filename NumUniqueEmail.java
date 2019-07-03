class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> ue = new HashSet<>();
        for (String email: emails) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < email.length() ;i++) {
                if (email.charAt(i) == '.') {
                    continue;
                } else if (email.charAt(i) == '+' || email.charAt(i) == '@') {
                    sb.append(email.substring(email.indexOf('@')));
                    break;
                } else {
                    sb.append(email.charAt(i));
                }
            }
            ue.add(sb.toString());
        }
        return ue.size();
    }
}
