package aspects;

import larva.*;
public aspect _asp_postAlerts0 {

public static Object lock = new Object();

boolean initialized = false;

after():(staticinitialization(*)){
if (!initialized){
	initialized = true;
	_cls_postAlerts0.initialize();
}
}
before () : (call(* *.ClearAlerts(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_postAlerts0.lock){

_cls_postAlerts0 _cls_inst = _cls_postAlerts0._get_cls_postAlerts0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 12/*ClearAlerts*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 12/*ClearAlerts*/);
}
}
before () : (call(* *.CreateAlert(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_postAlerts0.lock){

_cls_postAlerts0 _cls_inst = _cls_postAlerts0._get_cls_postAlerts0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 10/*CreateAlert*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 10/*CreateAlert*/);
}
}
}