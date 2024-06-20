package com.jp.common.exception.file;

import com.jp.common.exception.base.BaseException;

/**
 * 文件信息异常类
 *
 * @author jp
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
