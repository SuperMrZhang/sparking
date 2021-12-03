/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.sparking.bootstrap.controller.emsongeomagnetic;

import cn.sparking.bootstrap.model.emsongeomagnetic.EmsonGeomagneticRequest;
import cn.sparking.bootstrap.result.emsongeomagnetic.EmsonGeomagneticResponse;
import cn.sparking.bootstrap.services.emsongeomagnetic.EmsonGeomagneticService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/EmsonGeomagnetic")
public class EmsonGeomagneticController {

    private final EmsonGeomagneticService emsonGeomagneticService;

    public EmsonGeomagneticController(final EmsonGeomagneticService emsonGeomagneticService) {
        this.emsonGeomagneticService = emsonGeomagneticService;
    }

    /**
     * process api.
     * @param emsonRequest request params
     * @return {@link EmsonGeomagneticResponse}
     */
    @PostMapping(value = "/api")
    public EmsonGeomagneticResponse processApi(@RequestBody final EmsonGeomagneticRequest<Object> emsonRequest) {
        return emsonGeomagneticService.processApi(emsonRequest);
    }
}
