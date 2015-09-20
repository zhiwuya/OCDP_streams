package com.asiainfo.ocdp.streaming.config

import scala.beans.BeanProperty

/**
 * Created by tsingfu on 15/8/18.
 */
class EventConf(conf: Map[String, String] = null) extends BaseConf(conf) {
  @BeanProperty var id: String = ""
  @BeanProperty var inIFId: String = ""
  @BeanProperty var outIFIds: Array[DataInterfaceConf] = null
  @BeanProperty var name: String = ""
  @BeanProperty var event_expr: String = ""
  @BeanProperty var p_event_id: String = ""

}

