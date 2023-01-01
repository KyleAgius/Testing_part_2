package aspects;

import larva.*;
public aspect _asp_viewAlerts0 {

public static Object lock = new Object();

boolean initialized = false;

after():(staticinitialization(*)){
if (!initialized){
	initialized = true;
	_cls_viewAlerts0.initialize();
}
}
before () : (call(* *.LoggedOut(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_viewAlerts0.lock){

_cls_viewAlerts0 _cls_inst = _cls_viewAlerts0._get_cls_viewAlerts0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 16/*LoggedOut*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 16/*LoggedOut*/);
}
}
before () : (call(* *.ViewedAlerts(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_viewAlerts0.lock){

_cls_viewAlerts0 _cls_inst = _cls_viewAlerts0._get_cls_viewAlerts0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 18/*ViewedAlerts*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 18/*ViewedAlerts*/);
}
}
before () : (call(* *.LogIn(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_viewAlerts0.lock){

_cls_viewAlerts0 _cls_inst = _cls_viewAlerts0._get_cls_viewAlerts0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 14/*LogIn*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 14/*LogIn*/);
}
}
}