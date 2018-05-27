package com.prato.cloud;

import com.prato.cloud.mapper.MchInfoMapper;
import com.prato.cloud.mapper.PayChannelMapper;
import com.prato.cloud.mapper.PayOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseService {
    @Autowired
    private PayOrderMapper payOrderMapper;

    @Autowired
    private MchInfoMapper mchInfoMapper;

    @Autowired
    private PayChannelMapper payChannelMapper;

}
