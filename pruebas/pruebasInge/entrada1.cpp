#include <stdio.h>
#include <stdlib.h>
float stack[100000000];
float heap[10000000];
int p;
int h;
float t0;
float t1;
float t2;
float t3;
float t4;
float t5;
float t6;
float t7;
float t8;
float t9;
float t10;
float t11;
float t12;
float t13;
float t14;
float t15;
float t16;
float t17;
float t18;
float t19;
float t20;
float t21;
float t22;
float t23;
float t24;
float t25;
float t26;
float t27;
float t28;
float t29;
float t30;
float t31;
float t32;
float t33;
float t34;
float t35;
float t36;
float t37;
float t38;
float t39;
float t40;
float t41;
float t42;
float t43;
float t44;
float t45;
float t46;
float t47;
float t48;
float t49;
float t50;
float t51;
float t52;
float t53;
float t54;
float t55;
float t56;
float t57;
float t58;
float t59;
float t60;
float t61;
float t62;
float t63;
float t64;
float t65;
float t66;
float t67;
float t68;
float t69;
float t70;
float t71;
float t72;
float t73;
float t74;
float t75;
float t76;
float t77;
float t78;
float t79;
float t80;
float t81;
float t82;
float t83;
float t84;
float t85;
float t86;
float t87;
float t88;
float t89;
float t90;
float t91;
float t92;
float t93;
float t94;
float t95;
float t96;
void JV_OperacionAlgebraica_OperacionAlgebraica() {
t1 = p + 0;
stack[(int) t1] = h;
h = h + 6;
printf("");
}
void JV_OperacionAlgebraica_Suma() {
printf( " \ n Ingrese el primer numero :");
printf( "\n");
printf( " aaa");
scanf("%f", &t17);
t18 = p + 0;
t19 = stack[(int) t18];
t20 = t19 + 0;
heap[(int) t20] = t17;
printf( " \ n Ingrese el segundo numero :");
printf( "\n");
printf( " bbb");
scanf("%f", &t21);
t22 = p + 0;
t23 = stack[(int) t22];
t24 = t23 + 1;
heap[(int) t24] = t21;
t25 = p + 0;
t26 = stack[(int) t25];
t27 = t26 + 0;
t28 = heap[(int) t27];
t29 = p + 0;
t30 = stack[(int) t29];
t31 = t30 + 1;
t32 = heap[(int) t31];
t33 = t28 + t32;
printf("");
}
void JV_OperacionAlgebraica_Contador() {
printf( " \ n Ingrese el numero hasta donde quiera contar");
printf( "\n");
printf( " cccc");
scanf("%f", &t37);
t38 = p + 0;
t39 = stack[(int) t38];
t40 = t39 + 3;
heap[(int) t40] = t37;
etWhile_1:
printf( "");
printf( "\n");
t41 = p + 0;
t42 = stack[(int) t41];
t43 = t42 + 4;
t44 = heap[(int) t43];
t45 = t44 + 1;
t49 = p + 0;
t50 = stack[(int) t49];
t51 = t50 + 4;
t52 = heap[(int) t51];
t53 = p + 0;
t54 = stack[(int) t53];
t55 = t54 + 3;
t56 = heap[(int) t55];
if(t52 <= t56) { goto et_2; }
goto et_3;
et_2:
goto etWhile_1;
et_3:
etFin_1:
printf("");
}
void JV_OperacionAlgebraica_Cuadrado_Integer() {
t57 = p + 2;
t58 = stack[(int) t57];
t59 = p + 2;
t60 = stack[(int) t59];
t61 = t58 * t60;
t62 = p + 2;
stack[(int) t62] = t61;
t63 = p + 2;
t64 = stack[(int) t63];
t65 = p + 1;
stack[(int) t65] = t64;
printf("");
}
void JV_OperacionAlgebraica_ElevarCuadrado() {
printf( " \ n Ingrese x para elevarlo al cuadrado :");
printf( "\n");
printf( " dddd");
scanf("%f", &t66);
t67 = p + 0;
t68 = stack[(int) t67];
t69 = t68 + 5;
heap[(int) t69] = t66;
printf( " \ n Antes de Elevarse es :");
printf( "\n");
printf( " \ n x despus de Elevarse es :");
printf( "\n");
printf("");
}
void PY_Continuar() {
printf( " Desea Repetir el Proceso [ s ] i o [ n ] o");
printf( "\n");
printf( " eee");
scanf("%f", &t71);
t72 = p + 1;
stack[(int) t72] = t71;
t73 = p + 1;
t74 = stack[(int) t73];
t75 = p + 0;
stack[(int) t75] = t74;
printf("");
}
int main() {
p = 0;
h = 0;
t77 = p + 0;
stack[(int)t77] = 's';
p = p + 2;
JV_OperacionAlgebraica_OperacionAlgebraica();
p = p - 2;
t78 = p + 2;
t79 = t78 + 0;
t80 = stack[(int)t79];
t81 = p + 1;
stack[(int)t81] = t80;
t82 = p + 1;
t83 = stack[(int)t82];
t84 = p + 2;
t85 = t84 + 0;
stack[(int)t85] = t83;
p = p + 2;
JV_OperacionAlgebraica_Suma();
p = p - 2;
t87 = p + 1;
t88 = stack[(int)t87];
t89 = p + 2;
t90 = t89 + 0;
stack[(int)t90] = t88;
p = p + 2;
JV_OperacionAlgebraica_Contador();
p = p - 2;
t92 = p + 1;
t93 = stack[(int)t92];
t94 = p + 2;
t95 = t94 + 0;
stack[(int)t95] = t93;
p = p + 2;
JV_OperacionAlgebraica_ElevarCuadrado();
p = p - 2;
return 0;
}