/*
 * Copyright (C) guolin, Suzhou Quxiang Inc. Open source codes for study only.
 * Do not use for commercial purpose.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pengllrn.base.network.protocal

/**
 * 请求响应的基类，这里封装了所有请求都必须会响应的参数，status和msg。
 *
 */
open class BaseResponse {

    /**
     * 请求结果的状态码
     */
    var status: Int = 0

    /**
     * 请求结果的简单描述。
     */
    var msg: String = ""
}