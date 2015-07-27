import groovy.json.JsonSlurper
File dir = classesDirectory
def reportFile = new File( dir, "/spel-maven-plugin/report.txt" );
assert reportFile.isFile()
def contents = new JsonSlurper().parseText(reportFile.getText())
assert contents instanceof Map

assert contents.getProperty("checked") == properties.getProperty("spel-annotations-amount")