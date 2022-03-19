/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */

#include "rand.h"


void
rand_prog_1(char *host,int aux,int auxs)
{
	CLIENT *clnt;
	void  *result_1;
	long  inicializa_random_1_arg;
	double  *result_2;
	char *obtiene_siguiente_random_1_arg;

#ifndef	DEBUG
	clnt = clnt_create (host, RAND_PROG, RAND_VERS, "udp");
	if (clnt == NULL) {
		clnt_pcreateerror (host);
		exit (1);
	}
#endif	/* DEBUG */
	int i;
	srand(auxs);
	inicializa_random_1_arg = (long)auxs;
	result_1 = inicializa_random_1(&inicializa_random_1_arg, clnt);
	if (result_1 == (void *) NULL) {
		clnt_perror (clnt, "call failed");
	}
        printf("Se inicializo la semilla");
	
	for(i = 0; i < aux; i++){
	result_2 = obtiene_siguiente_random_1((void*)&obtiene_siguiente_random_1_arg, clnt);
	if (result_2 == (double *) NULL) {
		clnt_perror (clnt, "call failed");
	}
	printf("%d : %d\n", i,result_2); //random());
	}
	
	//srandom(misemilla);
	//inicializa_random_1_svc(misemilla);
#ifndef	DEBUG
	clnt_destroy (clnt);
#endif	 /* DEBUG */
}


int
main (int argc, char *argv[])
{
	int misemilla, itera, i;
	char *host;
	itera = atoi(argv[3]);	
	misemilla = atoi(argv[2]);
	if (argc < 2) {
		printf ("usage: %s server_host\n", argv[0]);
		exit (1);
	}
	host = argv[1];
	rand_prog_1 (host,itera,misemilla);
		 

exit (0);
}