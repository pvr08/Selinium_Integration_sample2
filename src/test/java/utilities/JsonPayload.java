package utilities;

public class JsonPayload {

    public static String createIssuePayload(String assigneeId, String customfield_10000, String customfield_20000, String description, String duedate, String environment, String summary, String originalEstimate, String remainingEstimate) {
        return String.format(
                "{\n" +
                        "  \"fields\": {\n" +
                        "    \"assignee\": {\n" +
                        "      \"id\": \"%s\"\n" +
                        "    },\n" +
                        "    \"customfield_10000\": \"%s\",\n" +
                        "    \"customfield_20000\": \"%s\",\n" +
                        "    \"description\": {\n" +
                        "      \"content\": [\n" +
                        "        {\n" +
                        "          \"content\": [\n" +
                        "            {\n" +
                        "              \"text\": \"%s\",\n" +
                        "              \"type\": \"text\"\n" +
                        "            }\n" +
                        "          ],\n" +
                        "          \"type\": \"paragraph\"\n" +
                        "        }\n" +
                        "      ],\n" +
                        "      \"type\": \"doc\",\n" +
                        "      \"version\": 1\n" +
                        "    },\n" +
                        "    \"duedate\": \"%s\",\n" +
                        "    \"environment\": {\n" +
                        "      \"content\": [\n" +
                        "        {\n" +
                        "          \"content\": [\n" +
                        "            {\n" +
                        "              \"text\": \"%s\",\n" +
                        "              \"type\": \"text\"\n" +
                        "            }\n" +
                        "          ],\n" +
                        "          \"type\": \"paragraph\"\n" +
                        "        }\n" +
                        "      ],\n" +
                        "      \"type\": \"doc\",\n" +
                        "      \"version\": 1\n" +
                        "    },\n" +
                        "    \"summary\": \"%s\",\n" +
                        "    \"timetracking\": {\n" +
                        "      \"originalEstimate\": \"%s\",\n" +
                        "      \"remainingEstimate\": \"%s\"\n" +
                        "    }\n" +
                        "  }\n" +
                        "}",
                assigneeId, customfield_10000, customfield_20000, description, duedate, environment, summary, originalEstimate, remainingEstimate);
    }
}
