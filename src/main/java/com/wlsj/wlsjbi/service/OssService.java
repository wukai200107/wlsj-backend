package com.wlsj.wlsjbi.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author wlsj
 */
public interface OssService {
    /**
     * 上传头像到OSS
     *
     * @param file
     * @return
     */
    String uploadFileAvatar(MultipartFile file);
}
