package study.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    private String uploadFileName;
    public String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
