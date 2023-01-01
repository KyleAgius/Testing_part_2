package aspects;

import larva.*;
public aspect _asp_states0 {

public static Object lock = new Object();

boolean initialized = false;

after():(staticinitialization(*)){
if (!initialized){
	initialized = true;
	_cls_states0.initialize();
}
}
before () : (call(* *.LoggedOut(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_states0.lock){

_cls_states0 _cls_inst = _cls_states0._get_cls_states0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 76/*LoggedOut*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 76/*LoggedOut*/);
}
}
before () : (call(* *.ViewedAlerts(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_states0.lock){

_cls_states0 _cls_inst = _cls_states0._get_cls_states0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 78/*ViewedAlerts*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 78/*ViewedAlerts*/);
}
}
before () : (call(* *.ClearAlerts(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_states0.lock){

_cls_states0 _cls_inst = _cls_states0._get_cls_states0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 72/*ClearAlerts*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 72/*ClearAlerts*/);
}
}
before () : (call(* *.CreateAlert(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_states0.lock){

_cls_states0 _cls_inst = _cls_states0._get_cls_states0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 70/*CreateAlert*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 70/*CreateAlert*/);
}
}
before () : (call(* *.LogIn(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_states0.lock){

_cls_states0 _cls_inst = _cls_states0._get_cls_states0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 74/*LogIn*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 74/*LogIn*/);
}
}
}