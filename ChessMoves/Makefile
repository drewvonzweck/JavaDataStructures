#------------------------------------------------------------------------------
# A Makefile with macros
#------------------------------------------------------------------------------

JAVASRC    = ChessMoves.java 
SOURCES    = README Makefile $(JAVASRC)
MAINCLASS  = ChessMoves
CLASSES    = ChessMoves.class ChessBoard.class Bishop.class Chesspiece.class King.class Knight.class Queen.class Rook.class Pawn.class
JARFILE    = ChessMoves.jar

all: $(JARFILE)

$(JARFILE): $(CLASSES)
	echo Main-class: $(MAINCLASS) > Manifest
	jar cvfm $(JARFILE) Manifest $(CLASSES)
	rm Manifest

$(CLASSES): $(JAVASRC)
	javac -Xlint $(JAVASRC)

clean:
	rm $(CLASSES) $(JARFILE)