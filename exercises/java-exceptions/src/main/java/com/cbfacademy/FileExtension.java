package com.cbfacademy;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class FileExtension {

    public boolean check(String fileName) throws FilenameException {
        if (fileName == null || fileName.isEmpty()) {
        throw new FilenameException("file is empty");
    }
    return fileName.endsWith(".java");

}

    public Map<String, Integer> map(List<String> filenames) {
    Map<String, Integer> resultMap = new HashMap<>();
        for (String fileName : filenames) {
            try {
                boolean isJavaFile = this.check(fileName);

                resultMap.put(fileName, isJavaFile ? 1 : 0);
            } catch (FilenameException e) {
                resultMap.put(fileName, -1);
            }
        }

        return resultMap;
    
    }
}
