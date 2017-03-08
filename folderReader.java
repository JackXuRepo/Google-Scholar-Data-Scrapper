public void listFilesForFolder(final File folder) {
    for (final File fileEntry : folder.listFiles()) {
        if (fileEntry.isDirectory()) {
            listFilesForFolder(fileEntry);
        } else {
            addDataToLogList(fileEntry);
        }
    }
}


public void addDataToLogList(File fileToRead){
    try( FileReader fileStream = new FileReader( fileToRead ); 
    BufferedReader bufferedReader = new BufferedReader( fileStream ) ) {

    String line = null;

    while( (line = bufferedReader.readLine()) != null ) {
        if(logList.contains(line) == false){
            logList.add(line);
        }
    }

    } catch ( FileNotFoundException ex ) {
        //exception Handling
    } catch ( IOException ex ) {
        //exception Handling
}
	
}


public void writeLog(logList){
    for(String line : logList){
        writer.println(line);
    }
}



public main(){

    ArrayList<String> logList = new ArrayList<String>();

    try{
        PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
    } catch (IOException e) {
   // do something
    }


    final File folder = new File("/home/you/Desktop");
    listFilesForFolder(folder);

    writeLog(logList);
    System.out.println("Done.");
    writer.close();

}
