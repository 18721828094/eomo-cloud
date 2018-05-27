package com.prato.cloud.service;

import com.unboundid.util.json.JSONObject;

import java.util.Map;

/**
 *
 */
public interface MchInfoService {
    Map selectMchInfo(String jsonParam);

    JSONObject getByMchId(String mchId);
}
